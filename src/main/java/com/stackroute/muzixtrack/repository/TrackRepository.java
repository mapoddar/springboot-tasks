package com.stackroute.muzixtrack.repository;

import com.stackroute.muzixtrack.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
  public interface TrackRepository extends JpaRepository<Track,Integer> {

  }

