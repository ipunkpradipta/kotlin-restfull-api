package com.example.kotlinrestfullapinew.repository

import com.example.kotlinrestfullapinew.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository:JpaRepository<Product,String> {
}