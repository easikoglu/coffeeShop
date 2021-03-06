package com.coffeeshop.example.services.impl;

import com.coffeeshop.example.models.shoppingcart.jpa.ShoppingCartJpaEntity;
import com.coffeeshop.example.services.ShoppingCartService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by easikoglu on 31/01/16.
 */
@Service
@Transactional
public class ShoppingCartServiceImpl extends GenericServiceImpl<ShoppingCartJpaEntity,Long> implements ShoppingCartService {
}
