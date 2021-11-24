/**

Copyright 2013 Intel Corporation, All Rights Reserved.
Copyright 2019 OpenIO Corporation, All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

*/
package com.intel.cosbench.client.cdmiswift;

public interface CdmiSwiftConstants {

    // --------------------------------------------------------------------------
    // CONNECTION
    // --------------------------------------------------------------------------
    String TIMEOUT_KEY = "timeout";
    int TIMEOUT_DEFAULT = 30000;

    String ROOT_PATH_KEY = "root_path";
    String ROOT_PATH_DEFAULT = "/cdmi";

    String STORAGE_URL_KEY = "storage_url";
    String STORAGE_URL_DEFAULT = "http://127.0.0.1:8080/cdmi"; // default storage url for CDMI RI Server

    // --------------------------------------------------------------------------
    // CONTEXT NEEDS FROM AUTH MODULE
    // --------------------------------------------------------------------------
    String AUTH_TOKEN_KEY = "token";

    // --------------------------------------------------------------------------
    // Storage RESTful API
    // --------------------------------------------------------------------------
    String X_AUTH_TOKEN = "X-Auth-Token";
}
