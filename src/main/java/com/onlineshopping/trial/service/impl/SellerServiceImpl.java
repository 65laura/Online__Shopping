package com.onlineshopping.trial.service.impl;

import com.onlineshopping.trial.model.Seller;
import com.onlineshopping.trial.model.User;
import com.onlineshopping.trial.service.SellerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public class SellerServiceImpl implements SellerService {
    @Override
    public ResponseEntity<Page<Seller>> getAllSellers(Pageable pageable) {
        return null;
    }
}
