package com.example.kotlinrestfullapinew.repository

import com.example.kotlinrestfullapinew.entity.ApiKey
import org.springframework.data.jpa.repository.JpaRepository

interface ApiKeyRepository:JpaRepository<ApiKey,String> {
}