
/* Copyright 2016 Samsung Electronics Co., LTD
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

package org.gearvrf.x3d;

/**
 * 
 * @author m1.williams
 * sub class of route that allows us to distinguish those <ROUTE>s
 * that control sensors from those that control animations.
 * Enables quicker parsing of all the <ROUTE>s
 * Used within X3DObject as an array list of sensor ROUTES
 */

public class RouteSensor extends Route {

  public RouteSensor(String fromNode, String fromField, String toNode, String toField) {
    super(fromNode, fromField, toNode, toField);
  }

}


