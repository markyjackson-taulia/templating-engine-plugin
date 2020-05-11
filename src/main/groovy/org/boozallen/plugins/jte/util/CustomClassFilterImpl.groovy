/*
    Copyright 2018 Booz Allen Hamilton

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/
package org.boozallen.plugins.jte.util

import hudson.Extension
import jenkins.security.CustomClassFilter
import org.boozallen.plugins.jte.init.PipelineDecorator
import org.jenkinsci.plugins.workflow.cps.CpsThread
import org.boozallen.plugins.jte.util.TemplateLogger

/*
    see: https://github.com/jenkinsci/jep/blob/master/jep/200/README.adoc#extensibility
*/
@Extension
class CustomClassFilterImpl implements CustomClassFilter {
    @Override Boolean permits(Class<?> c){
        if(c.getName().startsWith("org.boozallen.plugins.jte") || c.getName().startsWith("script")){
            return true
        }
        return null
    }
}