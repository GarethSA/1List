package com.lolo.io.onelist.core.data.shared_preferences

import kotlinx.coroutines.flow.StateFlow

interface SharedPreferencesHelper {

    companion object {
        const val VERSION_PREF: String = "version"
        const val SELECTED_LIST_PREF = "selectedList"
        const val BACK_UP_LOCALLY_PREF = "backUpLocally"
        const val BACKUP_DISPLAYED_PATH = "backupDisplayPath" // only for display
        const val THEME_PREF: String = "theme"
        const val FIRST_LAUNCH_PREF = "firstLaunch"
        const val PREFER_USE_FILES_PREF = "preferUseFiles"

        const val THEME_AUTO = "auto"
        const val THEME_LIGHT = "light"
        const val THEME_DARK = "dark"
        const val THEME_DYNAMIC = "dynamic"

        const val FONT_SIZE_PREF = "fontSize"
        const val FONT_SIZE_SMALL = "small"
        const val FONT_SIZE_MEDIUM = "medium"
        const val FONT_SIZE_LARGE = "large"

        const val FONT_FAMILY_PREF = "fontFamily"
        const val FONT_FAMILY_DEFAULT = "default"
        const val FONT_FAMILY_ROBOTO = "roboto"
        const val FONT_FAMILY_LATO = "lato"
        const val FONT_FAMILY_OPENSANS = "opensans"
        const val FONT_FAMILY_MONTSERRAT = "montserrat"
        const val FONT_FAMILY_RALEWAY = "raleway"
    }

    var backupDisplayPath: String?
    var backupUri: String?
    var version: String
    var theme: String
    var firstLaunch: Boolean
    var preferUseFiles: Boolean
    var selectedListIndex: Int
    val selectedListIndexStateFlow: StateFlow<Int>
    val canAccessBackupUri: Boolean
    var fontSize: String
    var fontFamily: String
}
