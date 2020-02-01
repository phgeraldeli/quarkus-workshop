package io.quarkus.workshop.superheroes.fight;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Entity
@Schema(description = "Each fight has a winner and a loser")
public class Fight extends PanacheEntity {

	@NotNull
	public Instant fightDate;
	@NotNull
	public String winnerName;
	@NotNull
	public int winnerLevel;
	@NotNull
	public String winnerPicture;
	@NotNull
	public String loserName;
	@NotNull
	public int loserLevel;
	@NotNull
	public String loserPicture;
	@NotNull
	public String winnerTeam;
	@NotNull
	public String loserTeam;

	@Override
	public String toString() {
		return String.format(
				"fightDate: %s \nwinnerName: %s \nwinnerLevel: %s\nloserName: %s\nloserLevel: %s\nwinnerTeam: %s\nloserTeam: %s",
				this.fightDate, this.winnerName, this.winnerLevel, this.loserName, this.loserLevel, this.winnerTeam,
				this.loserTeam);
	}
}