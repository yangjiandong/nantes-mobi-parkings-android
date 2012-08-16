/*
* Copyright 2012 Damien Raude-Morvan, Alvin Berthelot,
*                Guillaume Granger and Nicolas Guillot
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
package fr.ippon.android.opendata.data.distance;

/**
 * Calcul d'une distance entre deux GpsPoint.
 *
 * @author Damien Raude-Morvan
 */
public interface DistanceCalculator {

    /**
     * Calcul de la distance en mètres entre les points <code>p1</code> et <code>p2</code>.
     *
     * @param p1 GpsPoint numéro 1
     * @param p2 GpsPoint numéro 2
     * @return Distance en mètres entre les deux points
     */
    double getDistanceBetweenPoints(GpsPoint p1, GpsPoint p2);
}
