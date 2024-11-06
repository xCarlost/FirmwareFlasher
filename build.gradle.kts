// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.6.1" apply false
    id("org.jetbrains.kotlin.android") version "1.7.20" apply false
    id("com.chaquo.python") version "15.0.1" apply false
}

tasks.register("clean", Delete::class) {
    delete(getLayout().getBuildDirectory())
}