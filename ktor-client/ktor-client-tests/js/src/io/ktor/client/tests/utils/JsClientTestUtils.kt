package io.ktor.client.tests.utils

import io.ktor.client.engine.*

/**
 * Perform test against all clients from dependencies.
 */
actual fun clientsTest(
    block: suspend TestClientBuilder<HttpClientEngineConfig>.() -> Unit
) = clientTest(block = block)
