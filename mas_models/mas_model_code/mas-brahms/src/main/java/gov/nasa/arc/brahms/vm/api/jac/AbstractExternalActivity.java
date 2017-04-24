/**
 Copyright © 2017, United States Government, as represented
 by the Administrator of the National Aeronautics and Space
 Administration. All rights reserved.

 The MAV - Modeling, analysis and visualization of ATM concepts
 platform is licensed under the Apache License, Version 2.0
 (the "License"); you may not use this file except in
 compliance with the License. You may obtain a copy of the
 License at http://www.apache.org/licenses/LICENSE-2.0.

 Unless required by applicable law or agreed to in writing,
 software distributed under the License is distributed on an
 "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 either express or implied. See the License for the specific
 language governing permissions and limitations under the
 License.
 **/
package gov.nasa.arc.brahms.vm.api.jac;

import gov.nasa.arc.brahms.vm.api.common.IConcept;
import gov.nasa.arc.brahms.vm.api.common.IContext;
import gov.nasa.arc.brahms.vm.api.exceptions.ExternalException;

/**
 * @author hamon
 */
public abstract class AbstractExternalActivity {

    public abstract void doActivity() throws ExternalException;

    public IContext getContext(){
        throw new UnsupportedOperationException();
    }

    public IConcept getParameterConcept(String param){
        throw new UnsupportedOperationException();
    }

    public int getParameterInt(String globalTime) {
        throw new UnsupportedOperationException();
    }

    public void setParameterDouble(String o_topETA, double topETA) {
        throw new UnsupportedOperationException();
    }

    public void setParameterInt(String o_lastArrival, int lastArrivalTime) {
        throw new UnsupportedOperationException();
    }
}
