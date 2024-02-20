package com.onlineshopping.trial.service;
import com.onlineshopping.trial.model.Seller;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface SellerService {
    public ResponseEntity<Page<Seller>> getAllSellers(Pageable pageable);
}
