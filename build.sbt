name := "protoc-jar-aarch64"

organization := "nl.zolotko.sbt"

publishTo := sonatypePublishToBundle.value

sonatypeCredentialHost := "s01.oss.sonatype.org"

sonatypeProfileName := "nl.zolotko.sbt"

versionScheme := Some("semver-spec")

crossVersion := CrossVersion.disabled