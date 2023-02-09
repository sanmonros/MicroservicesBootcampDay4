package com.nttdata.programacion_funcional_carrito;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App 
{
    public static void main( String[] args )
    {
    	List<Product> shopping = List.of(
                new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
                new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
                new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
                new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
                new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
                new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));
    	
    	//Implementación
    	
    	//Programación Imperativa
    	
    	/*
    	BigDecimal total = new BigDecimal("0");
        List<String> cProducts = new ArrayList<>();

        for (Product product : shopping) {
            total = total.add(product.getPrice().multiply(BigDecimal.valueOf(1 + (product.getTax().getPercent() / 100.0))));
            if (product.getName().toLowerCase().startsWith("c")) {
                cProducts.add(product.getName());
            }
        }

        cProducts.sort(String::compareToIgnoreCase);

        System.out.println("Total: " + total);
        System.out.println("Products starting with 'C': " + String.join(", ", cProducts));
        */
        
        //Programación funcional
        
        BigDecimal totalF = shopping.stream()
                .map(p -> p.getPrice().multiply(BigDecimal.valueOf(1 + (p.getTax().getPercent() / 100.0))))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        List<String> cProductsF = shopping.stream()
                .filter(p -> p.getName().toLowerCase().startsWith("c"))
                .map(Product::getName)
                .sorted(String::compareToIgnoreCase)
                .collect(Collectors.toList());

        System.out.println("Total amount with taxes : " + totalF+ " €");
        System.out.println("Products starting with 'C': " + String.join(", ", cProductsF));
    }
    
}
