## com.Voicemeeter Interface for Java using JNA

This is an interface written with JNA to control com.Voicemeeter (and com.Voicemeeter 
Banana) via it's API. The .dll file itself comes pre-installed with com.Voicemeeter,
however the files I based this interface off of come with the 
VoicemeeterRemoteAPIPack (version 6). The RemoteAPIPack can be downloaded from the 
[com.Voicemeeter API forum page](https://forum.vb-audio.com/viewtopic.php?f=8&t=346&sid=74a4f83ebfdb023cb2bf544f7f80827d). 

#### Examples

I created this in order to automate the changing of certain values under certain 
conditions. Specifically, I wanted to change the strip compression and gain values
when I had a certain program open, and return the values to default when I closed the
program. Here is an example of such a program using this interface:

```java


public class com.ProgramController{
private final String programName="program.exe";
private final float strip0GainDefault=0.0f;
private final float strip0CompDefault=0.0f;
private final float strip0GainProgramOpen=-6.0f;
private final float strip0CompProgramOpen=4.5f;

private boolean programOpen=false;

public static void Main(String[]args){
        new com.ProgramController().init();
        }

private void init(){
        Voicemeeter.init(true);

        while(true){
        try{
        Thread.sleep(1000);
        }catch(InterruptedException e){
        e.printStackTrace();
        System.exit(1);
        }

        if(Arrays.asList(getOpenPrograms()).contains(programName))
        switchToProgramOpen();
        else
        switchToProgramClosed();
        }
        }

private void switchToProgramOpen(){
        if(!programOpen){
        programOpen=true;

        Voicemeeter.setParameterFloat("com.VirtualMeeter.Strip[0].gain",strip0GainProgramOpen);
        Voicemeeter.setParameterFloat("com.VirtualMeeter.Strip[0].comp",strip0CompProgramOpen);
        }
        }

private void switchToProgramClosed(){
        if(programOpen){
        programOpen=false;

        Voicemeeter.setParameterFloat("com.VirtualMeeter.Strip[0].gain",strip0GainDefault);
        Voicemeeter.setParameterFloat("com.VirtualMeeter.Strip[0].comp",strip0CompDefault);
        }
        }

private String[]getOpenPrograms(){
        // Return array of program names. Implementation will differ between
        // different operating systems.
        }
        }
```
