package org.rinmakh.springshell;

import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliAvailabilityIndicator;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.stereotype.Component;

/**
 * @author Rinat_Makhmutov
 */
@Component
public class PathCommand implements CommandMarker {

    @CliAvailabilityIndicator({"input"})
    public boolean isCommandAvailable(){
        return true;
    }

    @CliCommand(value = "input", help = "Path to source image")
    public String pathToSource(
            @CliOption(key = {"path"}, mandatory = true, help = "Path to the source image")
            String path
    ){
        return path;
    }


}
