package ge.lanmaster.gradle.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.OutputDirectory

class WSImportTask extends DefaultTask {
    
    def List<String> wsdlUrls
    
    def String bindingFilePath
    
    @OutputDirectory
    File outDir
            
    @TaskAction
    def wsimport() {
        wsdlUrls.each() {
            def temp = it
            println "run wsimport for "+ temp
            project.sourceSets.main.output.classesDir.mkdirs()
            outDir.mkdirs()
            def classpath = project.configurations.jaxws.asPath
            def destDir = project.sourceSets.main.output.classesDir
            project.ant {
                taskdef(name:'wsimport',
                    classname: 'com.sun.tools.ws.ant.WsImport',
                    classpath: classpath)
                wsimport(keep:true,
                    destdir: destDir,
                    sourcedestdir: outDir,
                    wsdl: temp,
                    binding: bindingFilePath)
            }
        }
    }
}
