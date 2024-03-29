package com.developer.allefsousa.totp.enum

enum class HmacAlgorithm(val macAlgorithmName: String, val hashBytes: Int) {
    SHA1("HmacSHA1", 20),
    SHA256("HmacSHA256", 32),
    SHA512("HmacSHA512", 64)
}