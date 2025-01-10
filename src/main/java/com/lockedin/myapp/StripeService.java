package com.lockedin.myapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.stripe.Stripe;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;

@Service
public class StripeService {

    @Value("${stripe.api.key}")
    private String stripeApiKey;

    public String createCheckoutSession(double totalPrice) throws Exception {
        // Set Stripe API key
        Stripe.apiKey = stripeApiKey;

        // Create a Stripe checkout session
        SessionCreateParams params = SessionCreateParams.builder()
                .setMode(SessionCreateParams.Mode.PAYMENT)
                .setSuccessUrl("http://localhost:8080/cart/success")
                .setCancelUrl("http://localhost:8080/cart/cancel")
                .addLineItem(SessionCreateParams.LineItem.builder()
                        .setQuantity(1L)
                        .setPriceData(SessionCreateParams.LineItem.PriceData.builder()
                                .setCurrency("usd")
                                .setUnitAmount((long) (totalPrice * 100))
                                .setProductData(SessionCreateParams.LineItem.PriceData.ProductData.builder()
                                        .setName("Cart Items")
                                        .build())
                                .build())
                        .build())
                .build();

        Session session = Session.create(params);

        // Debug log: Stripe Checkout URL
        System.out.println("Stripe Checkout URL: " + session.getUrl());

        return session.getUrl();
    }
}