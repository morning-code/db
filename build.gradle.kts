/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java Library project to get you started.
 * For more details take a look at the Java Libraries chapter in the Gradle
 * User Manual available at https://docs.gradle.org/6.0/userguide/java_library_plugin.html
 */
import nu.studer.gradle.jooq.JooqEdition

// @see https://github.com/etiennestuder/gradle-jooq-plugin/blob/master/example/use_kotlin_dsl/build.gradle.kts
plugins {
    //`java-library`
    id("java-library")
    id("org.flywaydb.flyway") version "6.3.0"
    // @see https://www.bountysource.com/issues/69612690-add-kotlin-dsl-support
    id("nu.studer.jooq")
    kotlin("jvm") version "1.3.50"
}

group = "io.code.morning"
version = "0.0.1-SNAPSHOT"
//java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    jcenter()
}

dependencies {
    implementation("mysql:mysql-connector-java:5.1.48")
    jooqRuntime("mysql:mysql-connector-java:5.1.48")
    //jooqRuntime("com.h2database:h2:1.4.193")
    implementation("org.jooq:jooq:3.12.3")
    implementation("org.jooq:jooq-parent:3.12.3")
    implementation("org.jooq:jooq-meta:3.12.3")
    implementation("org.jooq:jooq-meta-extensions:3.12.3")
    implementation("org.jooq:jooq-codegen:3.12.3")
    implementation("org.jooq:jooq-codegen-maven:3.12.3")
}

val dbUrl: String = "jdbc:mysql://127.0.0.1:3306/morning_code?useSSL=false"
val dbUser: String = "root"
val dbPassword: String = "password"

flyway {
    url = dbUrl
    user = dbUser
    password = dbPassword
}

jooq {
    version = "3.12.3"
    edition = JooqEdition.OSS
    "db"(sourceSets["main"]) {
        jdbc {
            driver = "com.mysql.jdbc.Driver"
            url = "jdbc:mysql://127.0.0.1:3306/morning_code"
            //url = "jdbc:mysql://local_db:3306/morning_code"
            //user = "mc_rw"
            user = "root"
            password = "password"
        }
        generator {
            name = "org.jooq.codegen.DefaultGenerator"
            database {
                name = "org.jooq.meta.mysql.MySQLDatabase"
                includes = ".*"
                excludes = ""
            }
            generate {
                isDeprecated = false
                isRecords = false
                isImmutablePojos = false
                isFluentSetters = false
            }
            target {
                packageName = "io.morningcode.db"
                directory = "src/main/java"
            }
            strategy {
                name = "org.jooq.codegen.DefaultGeneratorStrategy"
            }
        }
    }
}


/*
tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}

 */
