/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.seyren.es;

import com.seyren.core.domain.*;
import com.seyren.core.store.AlertsStore;
import com.seyren.core.store.ChecksStore;
import com.seyren.core.store.SubscriptionsStore;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

@Named
public class EsStore implements ChecksStore, AlertsStore, SubscriptionsStore {

    private static final Logger LOGGER = LoggerFactory.getLogger(EsStore.class);

    @Override
    public Alert createAlert(String checkId, Alert alert) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public SeyrenResponse<Alert> getAlerts(String checkId, int start, int items) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public SeyrenResponse<Alert> getAlerts(int start, int items) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteAlerts(String checkId, DateTime before) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Alert getLastAlertForTargetOfCheck(String target, String checkId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public SeyrenResponse getChecksByPattern(List<String> checkFields, List<Pattern> patterns, Boolean enabled) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public SeyrenResponse<Check> getChecks(Boolean enabled, Boolean live) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public SeyrenResponse<Check> getChecksByState(Set<String> states, Boolean enabled) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Check getCheck(String checkId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteCheck(String checkId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Check createCheck(Check check) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Check saveCheck(Check check) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Check updateStateAndLastCheck(String checkId, AlertType state, DateTime lastCheck) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Subscription createSubscription(String checkId, Subscription subscription) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteSubscription(String checkId, String subscriptionId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void updateSubscription(String checkId, Subscription subscription) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
