/*
 * Copyright (c) 2023 Toast, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("DEPRECATION")

// Generated by protokt version 0.12.1. Do not modify.
// Source: protokt/ext/inet_socket_address.proto
package com.toasttab.protokt.ext

import com.toasttab.protokt.Descriptor
import com.toasttab.protokt.FileDescriptor
import com.toasttab.protokt.rt.KtGeneratedFileDescriptor

@KtGeneratedFileDescriptor
@Deprecated("use v1")
object InetSocketAddressProto {
    val descriptor: FileDescriptor by lazy {
                val descriptorData = arrayOf(
                            "\n%protokt/ext/inet_socket_address.proto" +
                    "protokt.extprotokt/protokt.proto\"M\nI" +
                    "netSocketAddress*\naddress (BﾂC" +
                    "java.net.InetAddress\nport (Bg\nco" +
                    "m.toasttab.protokt.extBInetSocketAddres" +
                    "sProtoﾂC2\ncom.toasttab.protokt.extIne" +
                    "tSocketAddressProtobproto3"
                )

                FileDescriptor.buildFrom(
                    descriptorData,
                    listOf(
                        ProtoktProto.descriptor
                    )
                )
            }
}

val InetSocketAddress.Deserializer.descriptor: Descriptor
    get() = InetSocketAddressProto.descriptor.messageTypes[0]
