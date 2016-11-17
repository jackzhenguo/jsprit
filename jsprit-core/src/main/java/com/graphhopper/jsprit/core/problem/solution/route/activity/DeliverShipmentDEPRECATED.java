/*
 * Licensed to GraphHopper GmbH under one or more contributor
 * license agreements. See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 *
 * GraphHopper GmbH licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.graphhopper.jsprit.core.problem.solution.route.activity;

import com.graphhopper.jsprit.core.problem.job.Shipment;
import com.graphhopper.jsprit.core.problem.job.Shipment.BuilderBase;

public final class DeliverShipmentDEPRECATED extends DeliveryActivityNEW {

    public static final String NAME = "deliverShipment";

    public DeliverShipmentDEPRECATED(Shipment shipment,
                                     BuilderBase<? extends Shipment, ?> builder) {
        super(shipment, NAME, builder.getDeliveryLocation(), builder.getDeliveryServiceTime(),
            builder.getCapacity().invert(),
            builder.getDeliveryTimeWindows().getTimeWindows());
    }

    public DeliverShipmentDEPRECATED(DeliverShipmentDEPRECATED sourceActivity) {
        super(sourceActivity);
    }

    // Only for testing
    @Deprecated
    public DeliverShipmentDEPRECATED(Shipment s) {
        super(s, NAME, s.getDeliveryLocation(), s.getDeliveryServiceTime(),
            s.getSize().invert(),
            s.getDeliveryTimeWindows());
    }

}