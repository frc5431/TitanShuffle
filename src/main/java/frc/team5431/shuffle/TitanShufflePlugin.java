package frc.team5431.shuffle;

import com.google.common.collect.ImmutableList;

import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.theme.Theme;

import java.util.List;

@Description(group = "frc.team5431.shuffle", name = "TitanShufflePlugin", version = "0.0.5", summary = "5431's Shuffleboard Plugin")
public class TitanShufflePlugin extends Plugin {

  private static final Theme themeTitanLight = new Theme(TitanShufflePlugin.class, "Titan Light", "/frc/team5431/shuffle/titanlight.css");
    private static final Theme themeTitanDark = new Theme(TitanShufflePlugin.class, "Titan Dark", "/frc/team5431/shuffle/titandark.css");
    private static final Theme themeTitanBlue = new Theme(TitanShufflePlugin.class, "Titan Blue", "/frc/team5431/shuffle/titanblue.css");
    private static final Theme themeTitanTieDye = new Theme(TitanShufflePlugin.class, "Titan Tie Dye", "/frc/team5431/shuffle/titantiedye.css");

    @Override
    public List<Theme> getThemes() {
      return ImmutableList.of(themeTitanLight, themeTitanDark, themeTitanBlue, themeTitanTieDye);
    }

}
