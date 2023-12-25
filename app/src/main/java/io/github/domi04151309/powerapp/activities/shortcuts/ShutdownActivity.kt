package io.github.domi04151309.powerapp.activities.shortcuts

import io.github.domi04151309.powerapp.R
import io.github.domi04151309.powerapp.helpers.PowerOptions

class ShutdownActivity : ShortcutActivity() {
    override fun getShortcutName(): String {
        return resources.getString(R.string.Shutdown)
    }

    override fun onOpened() {
        PowerOptions(this).shutdown()
    }
}
