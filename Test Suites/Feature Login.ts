<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Feature Login</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>60a5b378-798e-409d-8389-52a9c4659127</testSuiteGuid>
   <testCaseLink>
      <guid>984d3864-542b-4b5a-9791-1115341efc3e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Steps Definition/Feature Login/LGN01 - User login with valid credentials</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>953175dc-0358-430a-ad56-abf542f58388</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Steps Definition/Feature Login/LGN02 - User login without enter any data</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>90bd4fd2-3e52-45ef-b74d-e0cb972dfa3b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Steps Definition/Feature Login/LGN03 - User login with invalid email</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>ef81ea33-4ee9-4efc-baa5-1af9e00cd5fd</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Login Invalid Email</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>ef81ea33-4ee9-4efc-baa5-1af9e00cd5fd</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>email</value>
         <variableId>a7b7d8e3-bbda-4e20-9013-d97d2b22816f</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ef81ea33-4ee9-4efc-baa5-1af9e00cd5fd</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>d820896a-b85e-42f2-a9bc-b53c5b23bbd4</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ef81ea33-4ee9-4efc-baa5-1af9e00cd5fd</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>status</value>
         <variableId>2a409947-2d00-458e-b8eb-c53d609cd831</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>a0ed33a8-2c01-44db-a2e1-c0e9add536cc</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Steps Definition/Feature Login/LGN04 - User login with incorrect password</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>7cd394ef-d8b5-4cdd-99eb-fe3563dfff70</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Steps Definition/Feature Login/LGN05 - User login with incorrect email and incorrect password</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
