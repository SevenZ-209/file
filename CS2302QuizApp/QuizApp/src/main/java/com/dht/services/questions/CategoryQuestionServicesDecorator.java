/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.services.questions;

import java.util.List;

/**
 *
 * @author admin
 */
public class CategoryQuestionServicesDecorator extends QuestionServicesDecorator{

    public CategoryQuestionServicesDecorator(BaseQuestionServices decorator, String kw) {
        super(decorator, kw);
    }

    @Override
    public String getSQL(List<Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
