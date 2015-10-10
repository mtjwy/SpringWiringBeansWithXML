package com.mtjwy.spring.soundsystem.properties;

import org.springframework.beans.factory.annotation.Autowired;

import com.mtjwy.spring.soundsystem.CompactDisc;
import com.mtjwy.spring.soundsystem.MediaPlayer;

public class CDPlayer implements MediaPlayer {
	private CompactDisc compactDisc;

	@Autowired
	public void setCompactDisc(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}

	public void play() {
		compactDisc.play();
	}

}
