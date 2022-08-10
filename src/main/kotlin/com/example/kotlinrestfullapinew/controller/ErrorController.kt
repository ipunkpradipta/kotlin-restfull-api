package com.example.kotlinrestfullapinew.controller

import com.example.kotlinrestfullapinew.error.NotFoundException
import com.example.kotlinrestfullapinew.error.UnauthorizeException
import com.example.kotlinrestfullapinew.model.WebResponse
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import javax.validation.ConstraintViolationException

@RestControllerAdvice
class ErrorController {
    @ExceptionHandler(value = [ConstraintViolationException::class])
    fun validationHandler(constraintViolation: ConstraintViolationException): WebResponse<String> {
        return WebResponse(
            code=400,
            status="Bad Request",
            data=constraintViolation.message!!
        )
    }

    @ExceptionHandler(value = [NotFoundException::class])
    fun notFound(notFoundException:NotFoundException):WebResponse<String>{
        return WebResponse(
            code=404,
            status="Not Found",
            data="Not Found"
        )
    }

    @ExceptionHandler(value = [UnauthorizeException::class])
    fun unauthorized(unauthorizeException:UnauthorizeException):WebResponse<String>{
        return WebResponse(
            code=401,
            status="Unauthorized",
            data="Please put your X-Api-Key"
        )
    }
}