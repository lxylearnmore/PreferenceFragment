# PreferenceFragment
实验4：使用Preference Fragment实现设置页面

整体效果：

![](https://i.loli.net/2019/04/13/5cb14ee201c12.png)

## 1）：In-line preference



![](https://i.loli.net/2019/04/13/5cb1505ecd801.png)

​			选中后：

![](https://i.loli.net/2019/04/13/5cb15078c375e.png)

相关代码：

``

```
<PreferenceCategory
    android:title="In-line preference"
    android:key="pref_key_first_settings">
    <CheckBoxPreference
        android:key="pref_key_checkbox"
        android:summary="This is a checkbox"
        android:title="Checkbox preference"
        android:defaultValue="false"/>

</PreferenceCategory>
```

## 2）：Dialog_based Preference

![](https://i.loli.net/2019/04/13/5cb1516d6179b.png)![](https://i.loli.net/2019/04/13/5cb15181104cb.png)

![](https://i.loli.net/2019/04/13/5cb1519b2931b.png)

相关代码：

``

```
<PreferenceCategory
    android:title="Dialog-based preference"
    android:key="pref_key_second_settings"
    >
    <EditTextPreference
        android:key="pref_key_edit_text"
        android:summary="An example that uses an edit text dialog"
        android:title="Edit text preference"
        android:dialogTitle="Enter your favorite animal"/>
    <ListPreference
        android:key="pref_key_list_preference"
        android:summary="An example that uses a list dialog"
        android:title="List preference"
        android:entries="@array/list_entries"
        android:entryValues="@array/list_entries_value"
        android:dialogTitle="Choose one"
        />
</PreferenceCategory>
```

``

```
<resources>
    <string name="app_name">PreferenceFragment</string>
    <string-array name="list_entries">
        <item>Alpha Option 01</item>
        <item>Beta Option 02</item>
        <item>Charlie Option 03</item>
    </string-array>
    <string-array name="list_entries_value">
        <item>option 01</item>
        <item>option 02</item>
        <item>option 03</item>
    </string-array>
</resources>
```

## 3）：Launch Preference

![](https://i.loli.net/2019/04/13/5cb1526a225ae.png)

![](https://i.loli.net/2019/04/13/5cb1524a7db28.png)

![](https://i.loli.net/2019/04/13/5cb152895a066.png)

代码：

``

```
<PreferenceCategory
    android:title="Launch preference"
    android:key="pref_key_third_settings">
    <PreferenceScreen
        xmlns:android="http://schemas.android.com/apk/res/android"
        android:title="Screen preference">
        <CheckBoxPreference
            android:title="Toggle preference"
            android:summary="Preference that is on the next screen but same hierarchy"
            />
    </PreferenceScreen>

    <Preference
        android:title="Intent preference"
        android:summary="Launches an Activity from Intent"
        android:key="pref_key_intent">
        <intent
            android:action="android.intent.action.VIEW"
            android:data="https://www.baidu.com/"/>
    </Preference>

</PreferenceCategory>
```

## 4）：Preference Attributes

![](https://i.loli.net/2019/04/13/5cb152e2094dc.png)![](https://i.loli.net/2019/04/13/5cb1533addd14.png)

代码：

``

```
<PreferenceCategory
    android:title="Preference attributes"
    android:key="pref_key_forth_settings">
    <CheckBoxPreference
        android:title="Parent checkbox preference"
        android:summary="This is visually a parent"
        android:key="pref_key_checkbox_parent"
        />
    <CheckBoxPreference
        android:title="Child checkbox preference"
        android:summary="This is visually a child"
        android:key="pref_key_checkbox_child"
        android:dependency="pref_key_checkbox_parent"
        />
</PreferenceCategory>
```
