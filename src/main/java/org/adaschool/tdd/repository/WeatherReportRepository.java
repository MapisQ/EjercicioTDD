package org.adaschool.tdd.repository;

import org.adaschool.tdd.repository.document.WeatherReport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WeatherReportRepository  extends MongoRepository<WeatherReport, String>{
    List<WeatherReport> findWeatherReportByReporter(String reporter);

}
