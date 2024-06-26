package com.example.ckoframesandroid.ui.utils

import com.checkout.base.model.Environment

/**
 * Target platform environment
 */
val ENVIRONMENT: Environment = Environment.SANDBOX

/**
 * Replace with public key from Hub in Sandbox Environment
 */
const val PUBLIC_KEY = "pk_sbox_cdv4zampkdpb3mqae4ig734sviy"

/**
 * Replace with public key from Hub in Sandbox Environment, testing key for CVV Tokenization
 */
const val PUBLIC_KEY_CVV_TOKENIZATION = "pk_sbox_cdv4zampkdpb3mqae4ig734sviy"

/**
 * Replace with Secret key from Hub in Sandbox Environment
 */
const val SECRET_KEY = "sk_sbox_ugfg6fq3leqzedbxbdzbvr4gw4\$"

/**
 * Replace with Success/Failure Urls from Hub in Sandbox Environment
 */
const val SUCCESS_URL = "https://www.checkout.com/"
const val FAILURE_URL = "https://www.checkout.com/"

const val CORNER_RADIUS_PERCENT = 12
const val URL_IDENTIFIER = "URL"