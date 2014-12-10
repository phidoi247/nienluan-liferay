                Liferay Developer Studio 2.2.0 GA-1 README

1. Package Contents
2. Getting Started
3. Fix packs installed
4. How to obtain EPL derived source


                          1. Package Contents

Thank you for downloading and installing Liferay Developer Studio.  This
package contains the following:

    * Eclipse product based on Luna (4.4.1) for JEE Developers
    * Eclipse pre-installed with the latest Liferay IDE (2.2.1-ga2) and Liferay Developer Studio plug-ins
    * WebSphere 6/7/8 Server Adapter support
    * Kaleo Designer for Java
    * Bundled Liferay Plugins SDK 6.2 EE SP8
    * Bundled Liferay Portal 6.2 EE SP8 Tomcat Bundle
    * Example projects bundled with additional Plugins SDK


                          2. Getting Started

To start Studio simply execute the file  <install.dir>/DeveloperStudioShortcut.exe
Eclipse will launch and once it starts the bundled Plugins SDK and Portal EE
runtime will be automatically configured and be available for use.

Also an examples SDK is configured automatically and has several example
projects that are available for use by using the
File > New > Project... > Liferay > Developer Studio > Example Liferay Project

*Note*
Eclipse requires that there be a JRE 1.6 or greater in system path to launch.

                        3. Obtaining EPL derived source

Some classes in Developer Studio were derived from EPL source.  As per EPL requirements
the source for those classes can be located in the feature directory of this product:
<installation_directory>/features/com.liferay.studio.product_**/EPL_sources.txt
