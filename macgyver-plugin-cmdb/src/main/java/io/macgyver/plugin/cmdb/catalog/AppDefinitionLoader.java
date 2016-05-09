/**
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
package io.macgyver.plugin.cmdb.catalog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppDefinitionLoader extends AbstractCatalogLoader {

	public static final String APP_DEFINITION_LABEL="AppDefinition";
	public static final String APP_DEFINITION_ID="appId";

	Logger logger = LoggerFactory.getLogger(AppDefinitionLoader.class);


	public AppDefinitionLoader() {
		withAlternateNodeKey(APP_DEFINITION_ID).withNodeLabel(APP_DEFINITION_LABEL).withDirName("apps");
	}
}