/*
 * Copyright 2000-2014 Vaadin Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.vaadin.teemusa.beangrid.renderer;

import com.vaadin.server.ClientConnector;
import com.vaadin.server.Extension;

import elemental.json.JsonValue;

public interface Renderer<T> extends Extension {

     Class<T> getPresentationType();

    JsonValue encode(T value);

    @Override
    @Deprecated
    void remove();

    @Override
    @Deprecated
    void setParent(ClientConnector parent);
}
