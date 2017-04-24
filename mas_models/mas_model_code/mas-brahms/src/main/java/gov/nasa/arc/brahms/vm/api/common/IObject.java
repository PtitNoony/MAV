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
package gov.nasa.arc.brahms.vm.api.common;

import gov.nasa.arc.brahms.vm.api.exceptions.ExternalException;

import java.util.List;
import java.util.Map;

/**
 * @author hamon
 */
public class IObject {

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public boolean hasBeliefAttributeAnyValue(IObject iMap, String attributeName, boolean b, IContext ctx) throws ExternalException {
        throw new UnsupportedOperationException();
    }

    public int getBeliefAttributeInt(IObject departureQueue, String m_time, IContext ctx) {
        throw new UnsupportedOperationException();
    }

    public Map<Object,Object> getBeliefAttributeMap(IObject iMap, String attributeName, boolean b, IContext ctx) throws ExternalException {
        throw new UnsupportedOperationException();
    }

    public double getBeliefAttributeDouble(IObject bAFO, String mDAltitude, IContext ctx) {
        throw new UnsupportedOperationException();
    }

    public boolean getBeliefAttributeBoolean(IObject bAFO, String isDeparture, IContext ctx) {
        throw new UnsupportedOperationException();
    }

    public IConcept getBeliefAttributeConcept(IObject bAFO, String flightPlan, IContext ctx) {
        throw new UnsupportedOperationException();
    }

    public String getBeliefAttributeString(IObject bAFO, String afoName, IContext ctx) {
        throw new UnsupportedOperationException();
    }

    public void setBeliefAttributeInt(IObject bAFO, String mIAirspeed, int airSpeed, IContext ctx) {
        throw new UnsupportedOperationException();
    }

    public void setFactAttributeInt(IAgent bAFO, String mIAirspeed, int airSpeed, IContext ctx) {
        throw new UnsupportedOperationException();
    }

    public void setBeliefAttributeConcept(IAgent bAFO, String toWaypoint, IConcept toWaypoint1, IContext ctx) {
        throw new UnsupportedOperationException();
    }

    public void setFactAttributeConcept(IAgent bAFO, String toWaypoint, IConcept toWaypoint1, IContext ctx) {
        throw new UnsupportedOperationException();
    }

    public void setBeliefAttributeBoolean(IAgent bAFO, String isDeparture, boolean departure, IContext ctx) {
        throw new UnsupportedOperationException();
    }

    public void setFactAttributeBoolean(IAgent bAFO, String isDeparture, boolean departure, IContext ctx) {
        throw new UnsupportedOperationException();
    }

    public void setBeliefAttributeDouble(IAgent bAFO, String eta, double eta1, IContext ctx) {
        throw new UnsupportedOperationException();
    }

    public void setFactAttributeDouble(IAgent bAFO, String eta, double eta1, IContext ctx) {
        throw new UnsupportedOperationException();
    }

    public List<IConcept> getBeliefRelationConcepts(IAgent iController, String hasWaypoint, IContext ctx) {
        throw new UnsupportedOperationException();
    }
}
