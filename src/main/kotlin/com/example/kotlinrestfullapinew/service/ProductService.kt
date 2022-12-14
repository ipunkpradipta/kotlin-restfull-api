package com.example.kotlinrestfullapinew.service

import com.example.kotlinrestfullapinew.model.CreateProductRequest
import com.example.kotlinrestfullapinew.model.ListProductRequest
import com.example.kotlinrestfullapinew.model.ProductResponse
import com.example.kotlinrestfullapinew.model.UpdateProductRequest

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id:String):ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest):ProductResponse

    fun delete(id:String)

    fun list(listProductRequest: ListProductRequest):List<ProductResponse>

}