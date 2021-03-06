Dear Registration Team,

<#if provider.status == "pending initial approval">
A new application by [${user.name}] – [${user.email}] has been received for registering [${provider.id}] – [${provider.name}] as a new service provider in eInfraCentral.
You can review the application at ${endpoint}/serviceProvidersList and approve or reject it.
</#if>
<#if provider.status == "pending service template submission">
The application by [${user.name}] – [${user.email}] for registering [${provider.id}] has been accepted.
You can view the application status ${endpoint}/serviceProvidersList.
</#if>
<#if provider.status == "pending service template approval">
Information about the new service: [${service.id}] has been provided by [${user.name}] – [${user.email}].
You can review the information ${endpoint}/service/${service.id} and approve or reject it.
</#if>
<#if provider.status == "approved">
    <#if provider.active == true>
The service: [${service.id}] provided by [${user.name}] – [${user.email}] has been accepted.
You can view the application status ${endpoint}/serviceProvidersList.
    <#else>
The service provider [${provider.name}] has been set to inactive.
You can view the application status here ${endpoint}/serviceProvidersList.
    </#if>
</#if>
<#if provider.status == "rejected service template">
The service: [${service.id}] provided by [${user.name}] – [${user.email}] has been rejected.
You can view the application status ${endpoint}/serviceProvidersList.
</#if>
<#if provider.status == "rejected">
The application by [${user.name}] [${user.surname}] – [${user.email}] for registering [${provider.name}] has been rejected.
You can view the application status here ${endpoint}/serviceProvidersList.
</#if>
<#--<#if provider.status == "provider template registration">-->
<#--A new application by [${user.name}] – [${user.email}] has been received for registering [${provider.id}] – [${provider.name}] as a new service provider in eInfraCentral.-->
<#--You can review the application at ${endpoint}/serviceProvidersList and approve or reject it.-->
<#--</#if>-->
<#--<#if provider.status == "provider template approved">-->
<#--The application by [${user.name}] – [${user.email}] for registering [${provider.id}] has been accepted.-->
<#--You can view the application status ${endpoint}/serviceProvidersList.-->
<#--</#if>-->
<#--<#if provider.status == "provider template rejected">-->
<#--The application by [${user.name}] [${user.surname}] – [${user.email}] for registering [${provider.name}] has been rejected.-->
<#--You can view the application status here ${endpoint}/serviceProvidersList.-->
<#--</#if>-->
<#--<#if provider.status == "service template registration">-->
<#--Information about the new service: [${service.id}] has been provided by [${user.name}] – [${user.email}].-->
<#--You can review the information ${endpoint}/service/${service.id} and approve or reject it.-->
<#--</#if>-->
<#--<#if provider.status == "service template approved">-->
<#--The service: [${service.id}] provided by [${user.name}] – [${user.email}] has been accepted.-->
<#--You can view the application status ${endpoint}/serviceProvidersList.-->
<#--</#if>-->
<#--<#if provider.status == "service template rejected">-->
<#--The service: [${service.id}] provided by [${user.name}] – [${user.email}] has been rejected.-->
<#--You can view the application status ${endpoint}/serviceProvidersList.-->
<#--</#if>-->
    
Best Regards,
the eInfraCentral Team
