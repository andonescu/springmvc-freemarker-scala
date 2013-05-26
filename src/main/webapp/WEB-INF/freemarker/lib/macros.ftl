<#macro formInput form path required=false type="text" showErrors=true containerClass="">
<@spring.bind path="${form}.${path}" />
<dl class="${containerClass}">
	<dt><label for="${path?replace(".","_")}"><@spring.message code="${form}.${path}.label"/> <#if required==true>*</#if> </label></dt>
	<dd>
		<input type="${type}" name="${spring.status.expression}" value="${getCurrentValue()}" id="${path?replace(".","_")}"/>
		${printErrors(showErrors)}
	</dd>
</dl>
</#macro>

<#macro checkbox form path required=false showErrors=true containerClass="" value="true">
<@spring.bind path="${form}.${path}" />
<dl class="${containerClass}">
	<dt><label for="${path?replace(".","_")}"><@spring.message code="${form}.${path}.label"/> <#if required==true>*</#if> </label></dt>
	<dd>
	   	<#assign checked>
        	<#if spring.status.value?? && spring.status.value = value>checked="checked"</#if>
    	</#assign>
		<input type="checkbox" name="${spring.status.expression}"  id="${path?replace(".","_")}" value="${value?trim}" ${checked}}/>
		<input type="hidden" name="_${spring.status.expression}"/>
		${printErrors(showErrors)}
	</dd>
</dl>
</#macro>

<#macro formSelect form path values required=false showErrors=true containerClass="">
<@spring.bind path="${form}.${path}" />
<dl class="${containerClass}">
	<dt><label for="${path?replace(".","_")}"><@spring.message code="${form}.${path}.label"/> <#if required==true>*</#if> </label></dt>
	<dd>
		<select  id="${path?replace(".","_")}" name="${spring.status.expression}">
			<option value="">Choose</option>
		    <#if values?? && values?has_content >
		        <#list values as item>
		            <#if spring.status.value?exists && spring.status.value = item>
		                	<option value="${item}" selected="selected">${item}</option>
		                <#else>
		                    <option value="${item}">${item}</option>
		            </#if>
		        </#list>
		    </#if>
		</select>
		${printErrors(showErrors)}
	</dd>
</dl>
</#macro>

<#function getCurrentValue>
 	<#if spring.status.value??>
        <#return spring.status.value?string/>
        <#else>
            <#return "" />
    </#if>
</#function>

<#function printErrors showErrors>
	<#assign errorsData>
	<#if showErrors == true>
        <#list spring.status.errorMessages as error>
            <span class="error">${error}</span>
        </#list>
    </#if>
    </#assign>
    <#return errorsData>
</#function>