package frc.team5431.shuffle;

import com.google.common.collect.ImmutableList;

import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.theme.Theme;

import java.util.List;

@Description(group = "frc.team5431.shuffle", name = "TitanShufflePlugin", version = "0.0.1", summary = "5431's Shuffleboard Plugin")
public class TitanShufflePlugin extends Plugin {

    private static final Theme themeTitanDark = new Theme(TitanShufflePlugin.class, "Titan Dark", "/path/to/stylesheet");
    private static final Theme themeTitanLight = new Theme(TitanShufflePlugin.class, "Titan Light", "/path/to/stylesheet");

    @Override
    public List<Theme> getThemes() {
      return ImmutableList.of(themeTitanDark, themeTitanLight);
    }

}
