/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.java.escopos;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class ApplicationScopedCDI implements Serializable {
    
	private static final long serialVersionUID = 1L;
	private int count = 0;
    
    public int getCount(){
        return ++count;
    }
    public void setCount(int count){
        this.count = count;
    }
    public String enviar(){
        return null; 
    }
}
