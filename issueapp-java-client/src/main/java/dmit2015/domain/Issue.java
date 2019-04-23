package dmit2015.domain;

import java.time.LocalDate;

import javax.json.bind.annotation.JsonbDateFormat;

import lombok.Data;

@Data
// This class is generated from http://www.jsonschema2pojo.org/
public class Issue {

	private long issueId;
	
	private String issueLabel;
	
	@JsonbDateFormat(value="yyyy-MM-dd")
	private LocalDate issueDate;

}
