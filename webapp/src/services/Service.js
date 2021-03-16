import axios from "axios";

export default {
  add: (n1, n2) => 
    axios.get(`http://localhost:8080/prime/${n1}/${n2}`, {headers: {"Access-Control-Allow-Origin": "*"}}).then(json => json.data.result)
};