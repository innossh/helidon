/*
 * Copyright (c) 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Netty module for webserver.
 */
module io.helidon.webserver.netty {
    requires java.logging;

    requires io.helidon.webserver;
    requires io.helidon.common;
    requires io.helidon.common.http;
    requires io.helidon.common.reactive;

    requires io.netty.handler;
    requires io.netty.codec.http;
    requires io.netty.codec;
    requires io.netty.transport;
    requires io.netty.common;
    requires io.netty.buffer;
    requires io.netty.codec.http2;

    provides io.helidon.webserver.spi.WebServerFactory with io.helidon.webserver.netty.Factory;
}
