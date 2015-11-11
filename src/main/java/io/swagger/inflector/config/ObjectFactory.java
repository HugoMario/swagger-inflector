/*
 *  Copyright 2015 SmartBear Software
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.swagger.inflector.config;

/**
 * Behaviour for instantiating filters - provide your custom implementation to the Configuration
 * class for hooking into DI frameworks, script engines, etc
 */

public interface ObjectFactory extends ControllerFactory {

    /**
     * Instantiates the provided filter class
     *
     * @param filterClass the filter class to instantiate
     * @return an instance of the class
     */

    HandlerInvocationFilter instantiateFilter(String filterClass) throws IllegalAccessException, InstantiationException, ClassNotFoundException;
}
