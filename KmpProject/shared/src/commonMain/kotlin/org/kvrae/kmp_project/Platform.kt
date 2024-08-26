package org.kvrae.kmp_project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform