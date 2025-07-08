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
public abstract class QuestionServicesDecorator implements BaseQuestionServices{
    protected String kw;
    protected BaseQuestionServices decorator;

    public QuestionServicesDecorator(BaseQuestionServices decorator ,String kw) {
        this.kw = kw;
        this.decorator = decorator;
    }
 
  
}
