/*
 * Copyright 2013-2019 the original author or authors.
 *
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

package org.springframework.cloud.kubernetes;

import java.util.function.Supplier;

import io.fabric8.kubernetes.api.model.Pod;

/**
 * Utility interface to retrieve {@link Pod} related information.
 *
 * @author Ioannis Canellos
 */
public interface PodUtils {

	/**
	 * @return A supplier of the currentPod {@link Pod}. The supplier will hold the
	 * currentPod {@Pod} if inside Kubernetes or false, otherwise.
	 */
	Supplier<Pod> currentPod();

	/**
	 * @return true if called from within Kubernetes, false otherwise.
	 */
	Boolean isInsideKubernetes();

}
