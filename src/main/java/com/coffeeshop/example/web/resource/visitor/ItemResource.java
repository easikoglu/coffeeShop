package com.coffeeshop.example.web.resource.visitor;

import com.coffeeshop.example.web.resource.AdditionResource;
import com.coffeeshop.example.web.resource.ProductResource;

import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

/**
 * Created by easikoglu on 30/01/16.
 */
public interface ItemResource {

   BigDecimal accept(ItemVisitor visitor);
}
