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

package org.boozallen.plugins.jte.hooks

/*
    stores contextual information a hook might need to 
    respond accordingly. 

    step: the step that's triggering the hook 
    library: library that contributed the step triggering the hook
    args: any arguments passed to the step triggering the hook
*/
class HookContext implements Serializable{
    String library 
    String step 
}   