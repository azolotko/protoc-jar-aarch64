name := "protoc-jar-aarch64"

description := "Bundles protoc-3.11.4-osx-aarch_64.exe as a resource."

organization := "nl.zolotko.sbt"

licenses := Seq(
  "Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0.txt")
)

developers := List(
  Developer(
    "azolotko",
    "Alex Zolotko",
    "azolotko@gmail.com",
    url("https://github.com/azolotko")
  )
)
startYear := Some(2021)
homepage  := scmInfo.value map (_.browseUrl)
scmInfo := Some(
  ScmInfo(
    url("https://github.com/azolotko/protoc-jar-aarch64"),
    "scm:git:git@github.com:azolotko/protoc-jar-aarch64.git"
  )
)

publishTo := sonatypePublishToBundle.value

sonatypeCredentialHost := "s01.oss.sonatype.org"

sonatypeProfileName := "nl.zolotko.sbt"

versionScheme := Some("semver-spec")

crossVersion := CrossVersion.disabled